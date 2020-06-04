/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.apache.hadoop.hive.ql.exec.vector.expressions.gen;

import org.apache.hadoop.hive.ql.exec.vector.expressions.VectorExpression;
import org.apache.hadoop.hive.ql.exec.vector.DoubleColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.hadoop.hive.ql.exec.vector.VectorExpressionDescriptor;
import org.apache.hadoop.hive.ql.metadata.HiveException;

/**
 * Generated from template FilterColumnCompareScalar.txt, which covers binary comparison 
 * expressions between a column and a scalar, however output is not produced in a separate column. 
 * The selected vector of the input {@link VectorizedRowBatch} is updated for in-place filtering.
 */
public class FilterDoubleColGreaterEqualDoubleScalar extends VectorExpression {

  private static final long serialVersionUID = 1L;

  protected final int colNum;
  protected final double value;

  public FilterDoubleColGreaterEqualDoubleScalar(int colNum, double value) {
    this.colNum = colNum;
    this.value = value;
  }

  public FilterDoubleColGreaterEqualDoubleScalar() {
    super();

    // Dummy final assignments.
    colNum = -1;
    value = 0;
  }

  @Override
  public void evaluate(VectorizedRowBatch batch) throws HiveException {

    // return immediately if batch is empty
    final int n = batch.size;
    if (n == 0) {
      return;
    }

    if (childExpressions != null) {
      super.evaluateChildren(batch);
    }

    DoubleColumnVector inputColVector = (DoubleColumnVector) batch.cols[colNum];
    int[] sel = batch.selected;
    boolean[] inputIsNull = inputColVector.isNull;

    double[] vector = inputColVector.vector;

    if (inputColVector.noNulls) {
      if (inputColVector.isRepeating) {
        if (!(vector[0] >= value)) {
          //Entire batch is filtered out.
          batch.size = 0;
        }
      } else if (batch.selectedInUse) {
        int newSize = 0;
        for(int j=0; j != n; j++) {
          int i = sel[j];
          if (vector[i] >= value) {
            sel[newSize++] = i;
          }
        }
        batch.size = newSize;
      } else {
        int newSize = 0;
        for(int i = 0; i != n; i++) {
          if (vector[i] >= value) {
            sel[newSize++] = i;
          }
        }
        if (newSize < n) {
          batch.size = newSize;
          batch.selectedInUse = true;
        }
      }
    } else {
      if (inputColVector.isRepeating) {
        if (!inputIsNull[0]) {
          if (!(vector[0] >= value)) {
            //Entire batch is filtered out.
            batch.size = 0;
          }
        } else {
          batch.size = 0;
        }
      } else if (batch.selectedInUse) {
        int newSize = 0;
        for(int j=0; j != n; j++) {
          int i = sel[j];
          if (!inputIsNull[i]) {
           if (vector[i] >= value) {
             sel[newSize++] = i;
           }
          }
        }
        //Change the selected vector
        batch.size = newSize;
      } else {
        int newSize = 0;
        for(int i = 0; i != n; i++) {
          if (!inputIsNull[i]) {
            if (vector[i] >= value) {
              sel[newSize++] = i;
            }
          }
        }
        if (newSize < n) {
          batch.size = newSize;
          batch.selectedInUse = true;
        }
      }
    }
  }

  @Override
  public String vectorExpressionParameters() {
    return getColumnParamString(0, colNum) + ", val " + value;
  }

  @Override
  public VectorExpressionDescriptor.Descriptor getDescriptor() {
    return (new VectorExpressionDescriptor.Builder())
        .setMode(
            VectorExpressionDescriptor.Mode.FILTER)
        .setNumArguments(2)
        .setArgumentTypes(
            VectorExpressionDescriptor.ArgumentType.getType("double"),
            VectorExpressionDescriptor.ArgumentType.getType("double"))
        .setInputExpressionTypes(
            VectorExpressionDescriptor.InputExpressionType.COLUMN,
            VectorExpressionDescriptor.InputExpressionType.SCALAR).build();
  }
}

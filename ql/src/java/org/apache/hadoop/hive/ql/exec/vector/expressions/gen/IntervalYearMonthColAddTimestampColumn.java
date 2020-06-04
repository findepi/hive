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

import java.sql.Timestamp;

import org.apache.hadoop.hive.common.type.HiveIntervalYearMonth;
import org.apache.hadoop.hive.ql.exec.vector.expressions.VectorExpression;
import org.apache.hadoop.hive.ql.exec.vector.expressions.NullUtil;
import org.apache.hadoop.hive.ql.exec.vector.*;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.hadoop.hive.ql.exec.vector.VectorExpressionDescriptor;
import org.apache.hadoop.hive.ql.util.DateTimeMath;
import org.apache.hadoop.hive.ql.metadata.HiveException;

/**
 * Generated from template TimestampColumnArithmeticIntervalYearMonthColumn.txt, which covers binary arithmetic
 * expressions between columns.
 */
public class IntervalYearMonthColAddTimestampColumn extends VectorExpression {

  private static final long serialVersionUID = 1L;

  private final int colNum1;
  private final int colNum2;

  private transient final HiveIntervalYearMonth scratchIntervalYearMonth1 = new HiveIntervalYearMonth();
  private transient final DateTimeMath dtm = new DateTimeMath();

  public IntervalYearMonthColAddTimestampColumn(int colNum1, int colNum2, int outputColumnNum) {
    super(outputColumnNum);
    this.colNum1 = colNum1;
    this.colNum2 = colNum2;
  }

  public IntervalYearMonthColAddTimestampColumn() {
    super();

    // Dummy final assignments.
    colNum1 = -1;
    colNum2 = -1;
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

    // Input #1 is type Interval_Year_Month.
    LongColumnVector inputColVector1 = (LongColumnVector) batch.cols[colNum1];

    // Input #2 is type Timestamp.
    TimestampColumnVector inputColVector2 = (TimestampColumnVector) batch.cols[colNum2];

    // Output is type Timestamp.
    TimestampColumnVector outputColVector = (TimestampColumnVector) batch.cols[outputColumnNum];

    int[] sel = batch.selected;

    long[] vector1 = inputColVector1.vector;

    /*
     * Propagate null values for a two-input operator and set isRepeating and noNulls appropriately.
     */
    NullUtil.propagateNullsColCol(
      inputColVector1, inputColVector2, outputColVector, sel, n, batch.selectedInUse);

    /* Disregard nulls for processing. In other words,
     * the arithmetic operation is performed even if one or
     * more inputs are null. This is to improve speed by avoiding
     * conditional checks in the inner loop.
     */
    if (inputColVector1.isRepeating && inputColVector2.isRepeating) {
      scratchIntervalYearMonth1.set((int) vector1[0]);
      dtm.add(
          scratchIntervalYearMonth1, inputColVector2.asScratchTimestamp(0), outputColVector.getScratchTimestamp());
      outputColVector.setFromScratchTimestamp(0);
    } else if (inputColVector1.isRepeating) {
      scratchIntervalYearMonth1.set((int) vector1[0]);
      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          dtm.add(
              scratchIntervalYearMonth1, inputColVector2.asScratchTimestamp(i), outputColVector.getScratchTimestamp());
          outputColVector.setFromScratchTimestamp(i);
        }
      } else {
        for(int i = 0; i != n; i++) {
          dtm.add(
              scratchIntervalYearMonth1, inputColVector2.asScratchTimestamp(i), outputColVector.getScratchTimestamp());
          outputColVector.setFromScratchTimestamp(i);
        }
      }
    } else if (inputColVector2.isRepeating) {
      Timestamp value2 = inputColVector2.asScratchTimestamp(0);
      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          scratchIntervalYearMonth1.set((int) vector1[i]);
          dtm.add(
              scratchIntervalYearMonth1, value2, outputColVector.getScratchTimestamp());
          outputColVector.setFromScratchTimestamp(i);
        }
      } else {
        for(int i = 0; i != n; i++) {
          scratchIntervalYearMonth1.set((int) vector1[i]);
          dtm.add(
              scratchIntervalYearMonth1, value2, outputColVector.getScratchTimestamp());
          outputColVector.setFromScratchTimestamp(i);
        }
      }
    } else {
      if (batch.selectedInUse) {
        for(int j = 0; j != n; j++) {
          int i = sel[j];
          scratchIntervalYearMonth1.set((int) vector1[i]);
          dtm.add(
              scratchIntervalYearMonth1, inputColVector2.asScratchTimestamp(i), outputColVector.getScratchTimestamp());
          outputColVector.setFromScratchTimestamp(i);
        }
      } else {
        for(int i = 0; i != n; i++) {
          scratchIntervalYearMonth1.set((int) vector1[i]);
          dtm.add(
              scratchIntervalYearMonth1, inputColVector2.asScratchTimestamp(i), outputColVector.getScratchTimestamp());
          outputColVector.setFromScratchTimestamp(i);
        }
      }
    }

    /* For the case when the output can have null values, follow
     * the convention that the data values must be 1 for long and
     * NaN for double. This is to prevent possible later zero-divide errors
     * in complex arithmetic expressions like col2 / (col1 - 1)
     * in the case when some col1 entries are null.
     */
    NullUtil.setNullDataEntriesTimestamp(outputColVector, batch.selectedInUse, sel, n);
  }

  @Override
  public String vectorExpressionParameters() {
    return getColumnParamString(0, colNum1) + ", " + getColumnParamString(1, colNum2);
  }

  @Override
  public VectorExpressionDescriptor.Descriptor getDescriptor() {
    return (new VectorExpressionDescriptor.Builder())
        .setMode(
            VectorExpressionDescriptor.Mode.PROJECTION)
        .setNumArguments(2)
        .setArgumentTypes(
            VectorExpressionDescriptor.ArgumentType.getType("interval_year_month"),
            VectorExpressionDescriptor.ArgumentType.getType("timestamp"))
        .setInputExpressionTypes(
            VectorExpressionDescriptor.InputExpressionType.COLUMN,
            VectorExpressionDescriptor.InputExpressionType.COLUMN).build();
  }
}


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

import org.apache.hadoop.hive.ql.exec.vector.VectorExpressionDescriptor;
import org.apache.hadoop.hive.serde2.io.HiveDecimalWritable;
import org.apache.hadoop.hive.serde2.typeinfo.DecimalTypeInfo;

public class Decimal64ColumnNotBetween extends LongColumnNotBetween {
  private static final long serialVersionUID = 1L;

  public Decimal64ColumnNotBetween() {
    super();
  }

  public Decimal64ColumnNotBetween(int colNum, long leftValue, long rightValue, int outputColumnNum) {
    super(colNum, leftValue, rightValue, outputColumnNum);
  }

  @Override
  public String vectorExpressionParameters() {
    DecimalTypeInfo decimalTypeInfo1 = (DecimalTypeInfo) inputTypeInfos[1];
    HiveDecimalWritable writable1 = new HiveDecimalWritable();
    writable1.deserialize64(leftValue, decimalTypeInfo1.scale());

    DecimalTypeInfo decimalTypeInfo2 = (DecimalTypeInfo) inputTypeInfos[2];
    HiveDecimalWritable writable2 = new HiveDecimalWritable();
    writable2.deserialize64(rightValue, decimalTypeInfo2.scale());
    return
        getColumnParamString(0, colNum) +
        ", decimal64Left " + leftValue + ", decimalLeft " + writable1.toString() +
        ", decimal64Right " + rightValue + ", decimalRight " + writable2.toString();
  }
}

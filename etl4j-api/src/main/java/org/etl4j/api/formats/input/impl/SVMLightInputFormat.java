/*
 *
 *  *
 *  *  * Copyright 2015 Skymind,Inc.
 *  *  *
 *  *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *    you may not use this file except in compliance with the License.
 *  *  *    You may obtain a copy of the License at
 *  *  *
 *  *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  *    Unless required by applicable law or agreed to in writing, software
 *  *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *    See the License for the specific language governing permissions and
 *  *  *    limitations under the License.
 *  *
 *
 */

package org.etl4j.api.formats.input.impl;



import org.etl4j.api.conf.Configuration;
import org.etl4j.api.formats.input.BaseInputFormat;
import org.etl4j.api.records.reader.RecordReader;
import org.etl4j.api.records.reader.impl.SVMLightRecordReader;
import org.etl4j.api.split.InputSplit;

import java.io.IOException;

/**
 * SVMLight input format
 *
 * @author Adam Gibson
 */
public class SVMLightInputFormat extends BaseInputFormat {
    @Override
    public RecordReader createReader(InputSplit split, Configuration conf) throws IOException, InterruptedException {
        return createReader(split);
    }

    @Override
    public RecordReader createReader(InputSplit split) throws IOException, InterruptedException {
        SVMLightRecordReader reader = new SVMLightRecordReader();
        reader.initialize(split);
        return reader;
    }


}
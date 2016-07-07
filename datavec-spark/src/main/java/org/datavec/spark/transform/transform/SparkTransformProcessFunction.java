package org.datavec.spark.transform.transform;

import lombok.AllArgsConstructor;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.datavec.api.writable.Writable;
import org.datavec.api.transform.TransformProcess;

import java.util.Collections;
import java.util.List;

/**
 * Spark function for executing a transform process
 */
@AllArgsConstructor
public class SparkTransformProcessFunction implements FlatMapFunction<List<Writable>,List<Writable>> {

    private final TransformProcess transformProcess;

    @Override
    public Iterable<List<Writable>> call(List<Writable> v1) throws Exception {
        List<Writable> newList = transformProcess.execute(v1);
        if(newList == null) return Collections.emptyList();   //Example was filtered out
        else return Collections.singletonList(newList);
    }
}
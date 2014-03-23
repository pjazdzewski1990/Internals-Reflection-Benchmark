package pl.ug.reflect.benchmark;

import pl.ug.reflect.benchmark.fields.ReflectGetPublicSimpleBenchmark;

public class BenchmarkRunner {

	public static void main(String[] args) throws Exception {
		IMeasurable[] allTests = new IMeasurable[]{ 
			new ReflectMethodBenchmark(), 
			new ReflectGetPublicSimpleBenchmark() 
		}; 
		
		for(IMeasurable test : allTests){
			test.warmup();
			test.measure();
			test.dumpData();
		}
		System.out.println("End");
	}
}

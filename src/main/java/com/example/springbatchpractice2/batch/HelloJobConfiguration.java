package com.example.springbatchpractice2.batch;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration // 하나의 배치 Job을 정의 후, Bean 설정
//@RequiredArgsConstructor
public class HelloJobConfiguration {

//    // Job 구동 -> Step 실행 -> Taskelt 실행
//
//    private final JobBuilderFactory jobBuilderFactory; // Job을 생성하는 BuilderFactory
//    private final StepBuilderFactory stepBuilderFactory; // Step을 생성하는 BuilderFactory
//
//
//
//    @Bean
//    public Job helloJob() {
//        return jobBuilderFactory.get("helloJob") // hellojob 이라는 이름의 Job 생성
//                .start(helloStep1())
//                .next(helloStep2())
//                .build();
//    }
//
//    @Bean
//    public Step helloStep1() {
//        return stepBuilderFactory.get("helloStep1") // helloStep이라는 이름의 Step 생성
//                .tasklet(new Tasklet() {
//                    @Override
//                    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
//
//
//                        System.out.println("======================== ");
//                        System.out.println(">> Hello Spring Batch!! ");
//                        System.out.println("========================= ");
//
//                        return RepeatStatus.FINISHED;
//                    }
//                })
//                .build();
//    }
//
//    @Bean
//    public Step helloStep2() {
//        return stepBuilderFactory.get("helloStep2") // helloStep이라는 이름의 Step 생성
//                .tasklet(new Tasklet() {
//                    @Override
//                    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
//
//
//                        System.out.println("======================== ");
//                        System.out.println(">> step2 is executed");
//                        System.out.println("========================= ");
//
//                        return RepeatStatus.FINISHED;
//                    }
//                })
//                .build();
//    }
}

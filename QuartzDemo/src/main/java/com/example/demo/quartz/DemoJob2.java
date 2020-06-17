package com.example.demo.quartz;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Demo-Liu
 * @create 2020-06-10 11:24
 * @description springboot quartz测试用例
 */
@DisallowConcurrentExecution //不允许并发执行
@PersistJobDataAfterExecution  // 保存jobDataMap设置
public class DemoJob2 extends QuartzJobBean {
    private String jtbs;


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        System.out.println(jtbs+sdf.format(new Date())+"22222222测试任务2执行...");
    }


    public void setJtbs(String jtbs) {
        this.jtbs = jtbs;
    }
}

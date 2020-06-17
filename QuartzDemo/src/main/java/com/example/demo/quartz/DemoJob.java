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
public class DemoJob extends QuartzJobBean {
    private String jtbs;
    private String ss;



    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        System.out.println(jtbs+"="+ss+sdf.format(new Date())+"测试任务执行...");
//        Thread.sleep(10000);
        System.out.println(jtbs+"="+ss+sdf.format(new Date())+"测试任务执行完成...");
    }


    public void setJtbs(String jtbs) {
        this.jtbs = jtbs;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }
}

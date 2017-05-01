package com.freedom.transaction;

import com.sun.media.jfxmediaimpl.platform.PlatformManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

/**
 * Created by kshine on 2017/5/1.
 */
public class TestTx {
    public static void main(String[] args) {
        //平台事务管理器 PlatformManager
        // 事务详情   TransactionDefinition  确定 隔离级别 是否只读 超时等
        // 事务状态   TransactionStatus  保存点 事务是否完成
    }
}

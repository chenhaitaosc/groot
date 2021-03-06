package com.groot.flow.remoting;


import com.groot.flow.constant.Constants;

/**
 * @author : chenhaitao934
 * @date : 2:15 下午 2020/5/21
 */
public class GrootClientConfig {
    // 处理Server Response/Request
    private int clientWorkerThreads = 4;
    private int clientCallbackExecutorThreads = Constants.AVAILABLE_PROCESSOR * 2;
    private int clientSelectorThreads = 1;
    private int clientOnewaySemaphoreValue = 256;
    private int clientAsyncSemaphoreValue = 128;
    private long connectTimeoutMillis = 3000;
    // channel超过1分钟不被访问 就关闭
    private long channelNotActiveInterval = 1000 * 60;

    private int readerIdleTimeSeconds = 0;
    private int writerIdleTimeSeconds = 0;
    private int clientChannelMaxIdleTimeSeconds = 120;
    private String addr = "172.16.210.173:8080";
    public int getClientWorkerThreads() {
        return clientWorkerThreads;
    }

    public void setClientWorkerThreads(int clientWorkerThreads) {
        this.clientWorkerThreads = clientWorkerThreads;
    }

    public int getClientSelectorThreads() {
        return clientSelectorThreads;
    }

    public void setClientSelectorThreads(int clientSelectorThreads) {
        this.clientSelectorThreads = clientSelectorThreads;
    }

    public int getClientOnewaySemaphoreValue() {
        return clientOnewaySemaphoreValue;
    }

    public void setClientOnewaySemaphoreValue(int clientOnewaySemaphoreValue) {
        this.clientOnewaySemaphoreValue = clientOnewaySemaphoreValue;
    }

    public long getConnectTimeoutMillis() {
        return connectTimeoutMillis;
    }

    public void setConnectTimeoutMillis(long connectTimeoutMillis) {
        this.connectTimeoutMillis = connectTimeoutMillis;
    }

    public int getClientCallbackExecutorThreads() {
        return clientCallbackExecutorThreads;
    }

    public void setClientCallbackExecutorThreads(int clientCallbackExecutorThreads) {
        this.clientCallbackExecutorThreads = clientCallbackExecutorThreads;
    }

    public long getChannelNotActiveInterval() {
        return channelNotActiveInterval;
    }

    public void setChannelNotActiveInterval(long channelNotActiveInterval) {
        this.channelNotActiveInterval = channelNotActiveInterval;
    }

    public int getClientAsyncSemaphoreValue() {
        return clientAsyncSemaphoreValue;
    }

    public void setClientAsyncSemaphoreValue(int clientAsyncSemaphoreValue) {
        this.clientAsyncSemaphoreValue = clientAsyncSemaphoreValue;
    }

    public int getClientChannelMaxIdleTimeSeconds() {
        return clientChannelMaxIdleTimeSeconds;
    }

    public void setClientChannelMaxIdleTimeSeconds(int clientChannelMaxIdleTimeSeconds) {
        this.clientChannelMaxIdleTimeSeconds = clientChannelMaxIdleTimeSeconds;
    }

    public int getWriterIdleTimeSeconds() {
        return writerIdleTimeSeconds;
    }

    public void setWriterIdleTimeSeconds(int writerIdleTimeSeconds) {
        this.writerIdleTimeSeconds = writerIdleTimeSeconds;
    }

    public int getReaderIdleTimeSeconds() {
        return readerIdleTimeSeconds;
    }

    public void setReaderIdleTimeSeconds(int readerIdleTimeSeconds) {
        this.readerIdleTimeSeconds = readerIdleTimeSeconds;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

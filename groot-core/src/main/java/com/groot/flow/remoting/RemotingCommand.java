package com.groot.flow.remoting;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : chenhaitao934
 * @date : 3:46 下午 2020/5/20
 */
public class RemotingCommand implements Serializable {
    private int code;
    private int subCode;
    private int version = 0;
    private int opaque;
    private int flag;
    private int sid = -1;
    private String remark;
    private transient RemotingCommandBody body;
    private static final AtomicInteger requestId = new AtomicInteger(0);
    public static RemotingCommand createRequestCommand(int code, RemotingCommandBody body) {
        RemotingCommand cmd = new RemotingCommand();
        cmd.setCode(code);
        cmd.setBody(body);
        cmd.setOpaque(requestId.getAndIncrement());
        return cmd;
    }

    public static RemotingCommand createResponseCommand(int code, String remark, RemotingCommandBody body) {
        RemotingCommand cmd = new RemotingCommand();
        RemotingCommandHelper.markResponseType(cmd);
        cmd.setCode(code);
        cmd.setRemark(remark);
        cmd.setBody(body);
        cmd.setOpaque(requestId.getAndIncrement());
        return cmd;
    }
    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }


    public RemotingCommandBody getBody() {
        return body;
    }

    public void setBody(RemotingCommandBody body) {
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getSubCode() {
        return subCode;
    }

    public void setSubCode(int subCode) {
        this.subCode = subCode;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getOpaque() {
        return opaque;
    }

    public void setOpaque(int opaque) {
        this.opaque = opaque;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RemotingCommand{" +
                "code=" + code +
                ", subCode=" + subCode +
                ", version=" + version +
                ", opaque=" + opaque +
                ", flag=" + flag +
                ", sid=" + sid +
                ", remark='" + remark + '\'' +
                ", body=" + JSON.toJSONString(body) +
                '}';
    }
}
package cc.bitky.clustermanage.server.message.tcp;

import cc.bitky.clustermanage.server.message.MsgType;
import cc.bitky.clustermanage.server.message.base.BaseTcpResponseMsg;

/**
 * 设备回复: 开锁成功
 */
public class TcpMsgResponseOperateBoxUnlock extends BaseTcpResponseMsg {

    public TcpMsgResponseOperateBoxUnlock(int groupId, int boxId, int status) {
        super(groupId, boxId, status);
        setMsgId(MsgType.DEVICE_RESPONSE_REMOTE_UNLOCK);
    }
}

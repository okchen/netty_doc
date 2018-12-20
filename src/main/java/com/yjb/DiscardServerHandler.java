package com.yjb;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
//        ((ByteBuf)msg).release();
//        ByteBuf byteBuf = (ByteBuf) msg;
//        try {
//            while (byteBuf.isReadable()) {
//                System.out.print((char) byteBuf.readByte());
//                System.out.flush();
//                ctx.writeAndFlush(msg);
//            }
//        } finally {
//            ReferenceCountUtil.release(byteBuf);
//        }
        ctx.writeAndFlush(msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}

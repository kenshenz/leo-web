// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `Login.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.ksn.leo.rpc.ice.login;

public abstract class Callback_LoginWorker_login
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<com.ksn.leo.rpc.ice.login.LoginResp>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        LoginWorkerPrxHelper.__login_completed(this, __result);
    }
}

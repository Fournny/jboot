/**
 * Copyright (c) 2015-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.components.rpc.zbus;


import io.zbus.rpc.bootstrap.mq.ServiceBootstrap;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.core.rpc.zbus
 */
public class JbootServiceBootstrap extends ServiceBootstrap {

    public ServiceBootstrap addModule(Class clazz, Object impl, String group, String version) {
        String module = ZbusUtil.buildModule(clazz, group, version);
        this.processor.addModule(module, impl);
        return this;
    }


}

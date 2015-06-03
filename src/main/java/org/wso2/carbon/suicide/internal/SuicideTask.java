/*
*  Copyright (c) $today.year, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.suicide.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Random;

/**
 * TODO: class level comment
 */
public class SuicideTask implements Runnable {
    private static final Log log = LogFactory.getLog(SuicideTask.class);

    private static final int SUICIDE_SEED = 1000;

    private Random random = new Random();
    private int suicideIndex = random.nextInt(SUICIDE_SEED);

    public SuicideTask() {
    }

    public void run() {
        if(random.nextInt(SUICIDE_SEED) == suicideIndex){
            log.info("Carbon server is committing suicide... I'm sorry mama :(");
            System.exit(0);
        }
    }
}

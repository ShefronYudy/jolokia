/*
 * Copyright 2009-2013 Roland Huss
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jolokia.service.notif.sse;

import javax.management.Notification;

/**
 * Result class holding a notification and the handback object.
 *
 * @author roland
 * @since 23.03.13
 */
class SseNotificationResult {

    // List of notifications
    private Notification notification;

    // Handback object given during subscription
    private Object handback;

    SseNotificationResult(Notification pNotification, Object pHandback) {
        notification = pNotification;
        handback = pHandback;
    }

    public Notification getNotification() {
        return notification;
    }

    public Object getHandback() {
        return handback;
    }
}
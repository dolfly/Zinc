/*
 * Copyright (C) 2013 Tyler Treat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clarionmedia.zinc.message.impl;

/**
 * Implementation of {@link AbstractMessage} representing a complete {@link Document}.
 */
public abstract class Document<T> extends AbstractMessage {

    public Document(byte[] documentData) {
        super(MessageType.FULL_DOCUMENT);
        data = documentData;
    }

    public Document() {
        super(MessageType.FULL_DOCUMENT);
    }

    /**
     * Updates the {@code Document} with the given {@link DocumentFragment}.
     *
     * @param newFragment the {@code DocumentFragment} to update the {@code Document} with
     * @return {@code true} if the update succeeded, {@code false} if not
     */
    public abstract boolean update(DocumentFragment<T> newFragment);

    /**
     * Returns the complete document object.
     *
     * @return full document
     */
    public abstract T getFullState();

    @Override
     public MessageType getType() {
        return MessageType.FULL_DOCUMENT;
    }

}

/*
 * Copyright 2017, Yahoo! Inc. Licensed under the terms of the
 * Apache License 2.0. See LICENSE file at the project root for terms.
 */

package com.yahoo.memory;

/**
 * Defines the basic methods for managing the allocation and closing
 * of direct memory.
 *
 * @author Lee Rhodes
 *
 */
public interface MemoryManager extends MemoryRequestServer {

  WritableDirectHandle allocateDirect(long capacityBytes);

}

/*
 * Fwd: the port forwarding app
 * Copyright (C) 2016  Elixsr Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.elixsr.portforwarder.exceptions;

/**
 * Thrown when an attempt to bind a socket fails.
 */
public class BindException extends Exception {

    /**
     * {@inheritDoc}
     */
    public BindException() {
    }

    /**
     * {@inheritDoc}
     */
    public BindException(String detailMessage) {
        super(detailMessage);
    }

    /**
     * {@inheritDoc}
     */
    public BindException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    /**
     * {@inheritDoc}
     */
    public BindException(Throwable throwable) {
        super(throwable);
    }
}

/**
 * The MIT License (MIT)
 *
 *
 * Copyright (c) 2016-2018 Bertrand Martel
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package fr.bmartel.fadecandy.listener

import fr.bmartel.android.fadecandy.model.UsbItem

/**
 * Listener used for interface between activity & singleton.
 *
 * @author Bertrand Martel
 */
interface ISingletonListener {

    /**
     * called when server is started.
     */
    fun onServerStart()

    /**
     * called when server is closed.
     */
    fun onServerClose()

    /**
     * called when a server error occurs.
     */
    fun onServerError()

    /**
     * called when a Fadecandy USB device is attached.
     *
     * @param usbItem
     */
    fun onUsbDeviceAttached(usbItem: UsbItem?)

    /**
     * called when a Fadecandy USB device is detached.
     *
     * @param usbItem
     */
    fun onUsbDeviceDetached(usbItem: UsbItem?)

    /**
     * called when connection to server fail in host mode.
     */
    fun onServerConnectionFailure()

    /**
     * called when Fadecandy USB device list change
     *
     * @param size
     */
    fun onConnectedDeviceChanged(size: Int)

    /**
     * called when connection to server is successfull in host mode.
     */
    fun onServerConnectionSuccess()

    /**
     * called when connection to server is closed.
     */
    fun onServerConnectionClosed()
}

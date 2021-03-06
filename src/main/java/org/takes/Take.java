/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.takes;

import java.io.IOException;

/**
 * Take.
 *
 * <p>Take is a momentary snapshot of in-server reality, visible to the
 * end user via printable {@link org.takes.Response}. Each take is immutable.
 * Each take is instantiated and returned by method {@code route()} or
 * {@link org.takes.Takes}. For example, this is a simple web server
 * that returns "hello, world!" plain text web page:
 *
 * <pre> new FtBasic(
 *   new TsFixed(
 *     new Take() {
 *       &#64;Override
 *       public Response act() {
 *         return new RsText("hello, world!");
 *       }
 *     }
 *   ), 8080
 * ).start(Exit.NEVER);</pre>
 *
 * <p>All implementations of this interface must be immutable and thread-safe.
 *
 * @author Yegor Bugayenko (yegor@teamed.io)
 * @version $Id$
 * @since 0.1
 * @see org.takes.Takes
 */
public interface Take {

    /**
     * Print itself.
     * @return Response
     * @throws IOException If fails
     */
    Response act() throws IOException;

}

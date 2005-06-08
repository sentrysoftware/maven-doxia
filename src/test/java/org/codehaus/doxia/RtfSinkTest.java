package org.codehaus.doxia;

import org.codehaus.doxia.module.rtf.RtfSink;
import org.codehaus.doxia.sink.Sink;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id: RtfSinkTest.java,v 1.3 2004/09/15 01:04:04 jvanzyl Exp $
 */
public class RtfSinkTest
    extends AbstractSinkTestCase
{
    protected String outputExtension()
    {
        return "tex";
    }

    protected Sink createSink() throws Exception
    {
        return new RtfSink( new FileOutputStream( new File( getBasedirFile(), "target/output/test.rtf" ) ) );
    }
}

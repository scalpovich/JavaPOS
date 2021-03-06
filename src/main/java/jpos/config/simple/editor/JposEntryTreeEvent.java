package jpos.config.simple.editor;

///////////////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives. Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted. 
//
// The JavaPOS Config/Loader (aka JCL) is now under the CPL license, which 
// is an OSS Apache-like license.  The complete license is located at:
//    http://oss.software.ibm.com/developerworks/opensource/license-cpl.html
//
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

import jpos.config.JposEntry;

/**
 * Event class for the JposEntryEditor tree
 * @since 0.1 (Philly 99 meeting)
 * @author E. Michael Maximilien (maxim@us.ibm.com)
 */
class JposEntryTreeEvent extends EventObject
{
    /**
     * 2-argument ctor
     * @param source the event's source
     * @param entry the JposEntry that caused this event
     */
    public JposEntryTreeEvent( Object source, JposEntry entry )
    {
        super( source );
        jposEntry = entry;
    }

    /** @return the JposEntry for this event */
    public JposEntry getJposEntry() { return jposEntry; }

    //-------------------------------------------------------------------------
    // Instance variables
    //

    private JposEntry jposEntry = null;
}

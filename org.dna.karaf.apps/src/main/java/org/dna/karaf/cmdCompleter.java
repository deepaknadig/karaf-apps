package org.dna.karaf;

import org.apache.karaf.shell.api.console.CommandLine;
import org.apache.karaf.shell.api.console.Completer;
import org.apache.karaf.shell.api.console.Session;
import org.apache.karaf.shell.support.completers.StringsCompleter;

import java.util.List;

/**
 * Created by dna on 6/9/16.
 */
public class cmdCompleter implements Completer {
    public int complete(Session buffer, CommandLine cursor, List candidates) {
        StringsCompleter sc = new StringsCompleter();
        sc.getStrings().add("option1");
        sc.getStrings().add("option2");
        return sc.complete(buffer,cursor,candidates);
    }
}

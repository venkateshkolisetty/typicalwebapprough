/**
 * 
 */
package com.mevenk.rough.typicalwebapp.config;

import org.apache.logging.log4j.Level;

/**
 * @author Venkatesh
 *
 */
public interface TypicalWebAppLogger {

	// OFF 0 | FATAL 100 | ERROR 200 | WARN 300 | INFO 400 | DEBUG 500 | TRACE 600 |
	// ALL Integer.MAX_VALUE

	String THREAD_CONTEXT_KEY = "TypicalWebAppCorrelationId";

	String STRING_POOLING = "POOLING";
	Level POOLING = Level.forName(STRING_POOLING, 490);

	String STRING_CONFIG = "CONFIG";
	Level CONFIG = Level.forName(STRING_CONFIG, 470);

}

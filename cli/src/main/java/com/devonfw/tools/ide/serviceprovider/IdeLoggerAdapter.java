package com.devonfw.tools.ide.serviceprovider;

import static com.devonfw.tools.ide.context.AbstractIdeContext.loggingContext;

import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * Implementation of {@link Logger}.
 */
public class IdeLoggerAdapter implements Logger {

  private final String name;

  /**
   * The constructor.
   *
   * @param name of the logger.
   */
  public IdeLoggerAdapter(String name) {

    this.name = name;
  }

  @Override
  public String getName() {

    return name;
  }

  @Override
  public boolean isTraceEnabled() {
    return loggingContext.trace().isEnabled();
  }

  @Override
  public void trace(String s) {
    loggingContext.trace(s);
  }

  @Override
  public void trace(String s, Object o) {
    loggingContext.trace(s, o);
  }

  @Override
  public void trace(String s, Object o, Object o1) {
    loggingContext.trace(s, o, o1);
  }

  @Override
  public void trace(String s, Object... objects) {
    loggingContext.trace(s, objects);
  }

  @Override
  public void trace(String s, Throwable throwable) {
    loggingContext.trace(s, throwable);
  }

  @Override
  public boolean isTraceEnabled(Marker marker) {
    return loggingContext.trace().isEnabled();
  }

  @Override
  public void trace(Marker marker, String s) {
    loggingContext.trace(s);
  }

  @Override
  public void trace(Marker marker, String s, Object o) {
    loggingContext.trace(s, o);
  }

  @Override
  public void trace(Marker marker, String s, Object o, Object o1) {
    loggingContext.trace(s, o, o1);
  }

  @Override
  public void trace(Marker marker, String s, Object... objects) {
    loggingContext.trace(s, objects);
  }

  @Override
  public void trace(Marker marker, String s, Throwable throwable) {
    loggingContext.trace(s, throwable);
  }

  @Override
  public boolean isDebugEnabled() {
    if (loggingContext != null) {
      return loggingContext.debug().isEnabled();
    } else {
      return false;
    }

  }

  @Override
  public void debug(String s) {
    if (loggingContext != null) {
      loggingContext.debug(s);
    }
  }

  @Override
  public void debug(String s, Object o) {
    if (loggingContext != null) {
      loggingContext.debug(s, o);
    }
  }

  @Override
  public void debug(String s, Object o, Object o1) {
    if (loggingContext != null) {
      loggingContext.debug(s, o, o1);
    }
  }

  @Override
  public void debug(String s, Object... objects) {
    if (loggingContext != null) {
      loggingContext.debug(s, objects);
    }
  }

  @Override
  public void debug(String s, Throwable throwable) {
    if (loggingContext != null) {
      loggingContext.debug(s, throwable);
    }
  }

  @Override
  public boolean isDebugEnabled(Marker marker) {
    if (loggingContext != null) {
      return loggingContext.debug().isEnabled();
    } else {
      return false;
    }
  }

  @Override
  public void debug(Marker marker, String s) {
    loggingContext.debug(s);
  }

  @Override
  public void debug(Marker marker, String s, Object o) {
    loggingContext.debug(s, o);
  }

  @Override
  public void debug(Marker marker, String s, Object o, Object o1) {
    loggingContext.debug(s, o, o1);
  }

  @Override
  public void debug(Marker marker, String s, Object... objects) {
    loggingContext.debug(s, objects);
  }

  @Override
  public void debug(Marker marker, String s, Throwable throwable) {
    loggingContext.debug(s, throwable);
  }

  @Override
  public boolean isInfoEnabled() {
    return loggingContext.info().isEnabled();
  }

  @Override
  public void info(String s) {
    loggingContext.info(s);
  }

  @Override
  public void info(String s, Object o) {
    loggingContext.info(s, o);
  }

  @Override
  public void info(String s, Object o, Object o1) {
    loggingContext.info(s, o, o1);
  }

  @Override
  public void info(String s, Object... objects) {
    if (loggingContext != null) {
      loggingContext.info(s, objects);
    }
  }

  @Override
  public void info(String s, Throwable throwable) {
    loggingContext.info(s, throwable);
  }

  @Override
  public boolean isInfoEnabled(Marker marker) {
    return loggingContext.info().isEnabled();
  }

  @Override
  public void info(Marker marker, String s) {
    loggingContext.info(s);
  }

  @Override
  public void info(Marker marker, String s, Object o) {
    loggingContext.info(s, o);
  }

  @Override
  public void info(Marker marker, String s, Object o, Object o1) {
    loggingContext.info(s, o, o1);
  }

  @Override
  public void info(Marker marker, String s, Object... objects) {
    loggingContext.info(s, objects);
  }

  @Override
  public void info(Marker marker, String s, Throwable throwable) {
    loggingContext.info(s, throwable);
  }

  @Override
  public boolean isWarnEnabled() {
    return loggingContext.warning().isEnabled();
  }

  @Override
  public void warn(String s) {
    loggingContext.warning(s);
  }

  @Override
  public void warn(String s, Object o) {
    loggingContext.warning(s, o);
  }

  @Override
  public void warn(String s, Object... objects) {
    loggingContext.warning(s, objects);
  }

  @Override
  public void warn(String s, Object o, Object o1) {
    loggingContext.warning(s, o, o1);
  }

  @Override
  public void warn(String s, Throwable throwable) {
    loggingContext.warning(s, throwable);
  }

  @Override
  public boolean isWarnEnabled(Marker marker) {
    return loggingContext.warning().isEnabled();
  }

  @Override
  public void warn(Marker marker, String s) {
    loggingContext.warning(s);
  }

  @Override
  public void warn(Marker marker, String s, Object o) {
    loggingContext.warning(s, o);
  }

  @Override
  public void warn(Marker marker, String s, Object o, Object o1) {
    loggingContext.warning(s, o, o1);
  }

  @Override
  public void warn(Marker marker, String s, Object... objects) {
    loggingContext.warning(s, objects);
  }

  @Override
  public void warn(Marker marker, String s, Throwable throwable) {
    loggingContext.warning(s, throwable);
  }

  @Override
  public boolean isErrorEnabled() {
    return loggingContext.error().isEnabled();
  }

  @Override
  public void error(String s) {
    loggingContext.error(s);
  }

  @Override
  public void error(String s, Object o) {
    loggingContext.error(s, o);
  }

  @Override
  public void error(String s, Object o, Object o1) {
    loggingContext.error(s, o, o1);
  }

  @Override
  public void error(String s, Object... objects) {
    loggingContext.error(s, objects);
  }

  @Override
  public void error(String s, Throwable throwable) {
    loggingContext.error(s, throwable);
  }

  @Override
  public boolean isErrorEnabled(Marker marker) {
    return loggingContext.error().isEnabled();
  }

  @Override
  public void error(Marker marker, String s) {
    loggingContext.error(s);
  }

  @Override
  public void error(Marker marker, String s, Object o) {
    loggingContext.error(s, o);
  }

  @Override
  public void error(Marker marker, String s, Object o, Object o1) {
    loggingContext.error(s, o, o1);
  }

  @Override
  public void error(Marker marker, String s, Object... objects) {
    loggingContext.error(s, objects);
  }

  @Override
  public void error(Marker marker, String s, Throwable throwable) {
    loggingContext.error(s, throwable);
  }
}

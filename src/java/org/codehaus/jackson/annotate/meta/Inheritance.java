package org.codehaus.jackson.annotate.meta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Meta-annotation used to indicate if and how annotations of
 * {@link org.codehaus.jackson.annotate} package are inherited.
 * That is, are annotations of super classes (or methods of sub-classes)
 * to take effect in sub-classes.
 *<p>
 * Most annotations allow full inheritance, and the default value
 * is chosen accordingly
 */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Inheritance
{
    /**
     * By default (as well as if not used at all), full inheritance
     * is assumed
     */
    Inherit value() default Inherit.ALWAYS;
}

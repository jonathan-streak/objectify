package com.googlecode.objectify.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Placed on an entity field of type Ref<?> or of an actual entity type, this will cause
 * Objectify to fetch that entity when the containing entity is loaded.</p>
 * 
 * <p>If one or more Class values are passed in, these represent load groups.  The entity
 * will be fetched only if the load group is activated.  The class can be any arbitrary
 * class, and class inheritance is respected.</p>
 * 
 * <p>For example, for a class Foo extends Bar, specifying @Load(Bar.class) will cause
 * a field to load if the Foo.class group is enabled.</p>
 *  
 * @author Jeff Schnitzer <jeff@infohazard.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Load
{
	Class<?>[] value() default {};
}
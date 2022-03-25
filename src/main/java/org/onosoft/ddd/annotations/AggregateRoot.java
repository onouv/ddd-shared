package org.onosoft.ddd.annotations;

/**
 * An annotation to indicate that a class is an Aggregate Root.
 *
 * An aggregate root in domain driven design is an entity in an aggregate that
 * - owns all other elements inside the aggegate and
 * - is named like the aggregate
 *
 * Note that due to restrictions of the @interface mechanism in Java, these
 * relationships and constraints are not modeled in code.
 */
public @interface AggregateRoot {
}

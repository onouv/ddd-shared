package org.onosoft.ddd.annotations;

/**
 * An annotation to indicate that a class is an Aggregate.
 *
 * An Aggregate in domain driven design is transactional consistency boundary.
 *
 * An Aggregate composes parts of different type. Within an Aggregate, all modifications to
 * its state (i.e. the state of to its parts)
 * - must be achieved by means of operations which follow defined business rules
 * - are guaranteed to be consistent to these rules after the operation
 *
 * Wether this is achieved by means of database transactions or by other means such as event sourcing
 * is an implementation detail.
 *
 */
public @interface Aggregate {
}

package org.onosoft.ddd.annotations;

/**
 * An annotation to indicate that a class is representing a Domain Event.
 *
 * In domain driven design, a Domain Event is an occurrence in time, which carries
 * a defined meaning in the bounded context. Typically, Domain Events are issued
 * by an Aggregate and can be consumed by various interested parties, such as other
 * bounded contexts. They may carry additional information fields and lean themselves
 * towards a message-based communications architecture.
 */
public @interface DomainEvent {
}

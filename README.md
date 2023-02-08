
This is a simple Spring Boot Application.

It uses:

Kotlin
Spring Boot
Spring Data + JPA

The domain Entities are defined in Entities.kt

**Agents** provide **Consultations** to **Clients**.

A **Consultation** involves an **Agent**, a **Client** and an **Insurer**


Your Task:

Provide a Rest API using CRUD Methods to create and persist consultations.

URL accepting POST Requests :

/consultations/{consultationId}?clientId={clientId}&agentId={agentId}&insurer={insurerName}

MvcTest provides a Test which should be green when you are done.

Make sure you structure your code as you would in a real project.

Make sure to write Tests where appropriate.

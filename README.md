# Project Management System API
This project implements a simple Project Management System API using Java 17, Spring Boot, and an in-memory database (H2).

<h2>Features</h2>
<ul>
  <li>Create, Read, Update, and Delete (CRUD) operations for projects.</li>
  <li>RESTful API for managing projects.</li>
</ul>

<h2>Prerequisites</h2>
<ul>
<li>Proficiency in Java 17</li>
<li>Familiarity with Spring Boot framework</li>
<li>Understanding of RESTful API principles</li>
<li>Basic knowledge of in-memory databases</li>
</ul>

<h2>Setup</h2>
<ol>
  <li>Clone this repository.</li>
  <li>Install dependencies using Maven or Gradle (refer to Spring Boot documentation for details).</li>
  <li>Configure the database connection details in application.properties.</li>
</ol>

<h2>Running the application</h2>
<ol>
  <li>Run the application using your preferred Java IDE or from the command line:
      <h3>Bash</h3>
      mvn spring-boot:run
  </li>
  <li>The application will start on port 8080 by default (you can configure this in application.properties).</li>
</ol>

<h2>Using the API</h2>
The API provides endpoints for managing projects:
<ul>
  <li>Create Project (POST /projects): Creates a new project with provided details.</li>
  <li>Get All Projects (GET /projects): Retrieves all projects in the system.</li>
  <li>Get Project by ID (GET /projects/{id}): Retrieves a specific project by its ID.</li>
  <li>Update Project (PUT /projects/{id}): Updates an existing project with new details.</li>
  <li>Delete Project (DELETE /projects/{id}): Deletes a project by its ID.</li>
</ul>
<h3>Note:</h3>You can use tools like Talend, Postman or curl to interact with the API. Refer to the API documentation (generated using Swagger) for detailed information on request and response formats.

<h2>Contributing</h2>
We welcome contributions to this project. Please refer to the contribution guidelines before submitting a pull request.





# Spring Logger

1. Dependency Injection using Annotations – The EmployeeBean and DepartmentBean are marked as @Component, and @Autowired is used to inject DepartmentBean into EmployeeBean, ensuring loose coupling.

2. ApplicationContext for Bean Retrieval – The MainApp class initializes the Spring ApplicationContext to retrieve EmployeeBean, demonstrating how Spring manages dependencies automatically.

3. Logging for Output Verification – The application uses SLF4J (or another logger) to print logs, verifying that dependency injection has been correctly performed and DepartmentBean is successfully injected into EmployeeBean.
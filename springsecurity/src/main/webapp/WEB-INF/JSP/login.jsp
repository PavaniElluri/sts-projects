
<body>
    <h3>Custom Login Page</h3>
    
    

    <!-- The form submits a POST request to /login -->
    <form action="/login" method="POST">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        Username: <input type="text" name="username" /><br/>
        Password: <input type="password" name="password" /><br/>
        <input type="submit" value="Login" />
    </form>
</body>





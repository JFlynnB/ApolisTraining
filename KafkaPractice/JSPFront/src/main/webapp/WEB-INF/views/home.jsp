<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>${message}</h1>

    <form id="dataForm">
        <label for="inputText">Enter Text:</label>
        <input type="text" id="inputText" name="inputText" required />

        <br><br>

        <button type="button" onclick="sendData()">Submit</button>
    </form>

    <p id="responseText"></p>

    <script>
        function sendData() {
            const input = document.getElementById('inputText').value;

            fetch('http://localhost:8081/your-api-endpoint', { // 8081 = other service
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ text: input }),
            })
            .then(response => response.json())
            .then(data => {
                document.getElementById('responseText').innerText = 'Response: ' + JSON.stringify(data);
            })
            .catch(error => {
                console.error('Error:', error);
                document.getElementById('responseText').innerText = 'Error calling API';
            });
        }
    </script>

</body>
</html>

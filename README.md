# SpringApp
Demo app for Cloud Days 25

## Access SwaggerUI
Open in your browser:

http://localhost:8080/swagger-ui/index.html

## Access via Curl
Execute in your terminal:

    curl -X 'GET' \
    'http://localhost:8080/rest/app/demo/v1/{name}?name=Marian' \
    -H 'accept: application/json'
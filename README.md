# ExampleService
An example of a microservice for an object called User

## Endpoints

### /users [GET]
Returns all users

Response:
``` {
  "status": "SUCCESS",
  "data": [
    {
      "id": "1",
      "forename": "Tom",
      "surname": "Meeson",
      "email": "meesondev@gmail.com"
    },
    {
      "id": "2",
      "forename": "John",
      "surname": "Smith",
      "email": "johnsmith@abc.com"
    }
  ]
} 
```

### /users [POST]
Adds a new user to the system

Response:
``` {
  "status": "SUCCESS"
}
```

### /users/:id [GET]
Get a specific user by their ID

Response:
```{
  "status": "SUCCESS",
  "data":{
    "id": "3",
    "forename": "Bob",
    "surname": "Bobby",
    "email": "bobby@bob.net"
  }
}
```

### /users/:id [PUT]
Edit a specific user's properties

Response:
```{
  "status": "SUCCESS",
  "data":{
    "id": "3",
    "forename": "Bob",
    "surname": "Bobby",
    "email": "bobschangedemail@bob.net"
  }
}
```

### /users/:id [DELETE]
Deletes a specific user's data

Response:
```{
  "status": "SUCCESS",
  "message": "user deleted"
}
```

### /users/:id [OPTIONS]
Checks if a user with given ID exists

Response:
```{
  "status": "SUCCESS",
  "message": "user exists"
}
```

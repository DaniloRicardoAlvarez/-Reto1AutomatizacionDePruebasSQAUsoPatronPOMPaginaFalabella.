#language: es

Característica: login

  @exitoso
  Escenario: login exitoso

    Dado el usuario se encuentra en la pagina web falabella
    Cuando el ingrese el usuario con la contrasena da iniciar sesion
    Entonces el visualizara un mensaje en la pagina de usuario con su nombre
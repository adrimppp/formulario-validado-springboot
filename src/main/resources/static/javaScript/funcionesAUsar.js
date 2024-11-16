// Función para mostrar/ocultar las contraseñas
function togglePasswords() {
    // Obtener los elementos de los campos de contraseñas
    var passwordField1 = document.getElementById('clave');
    var passwordField2 = document.getElementById('confirmarClave');

    // Verificar el estado actual y alternarlo
    if (passwordField1.type === 'password') {
        passwordField1.type = 'text'; // Mostrar la contraseña
    } else {
        passwordField1.type = 'password'; // Ocultar la contraseña
    }

    if (passwordField2.type === 'password') {
        passwordField2.type = 'text'; // Mostrar la contraseña
    } else {
        passwordField2.type = 'password'; // Ocultar la contraseña
    }
}

function deseleccionarGenero() {
    // Obtiene todos los radios con el nombre 'generoSeleccionado'
    const radios = document.getElementsByName('generoSeleccionado');

    // Recorre todos los radios y deselecciona cada uno
    radios.forEach(function(radio) {
        radio.checked = false;
    });
}

function seleccionarTodasAficiones() {
    const checkboxes = document.getElementsByName('aficionesSeleccionadas');
    checkboxes.forEach(function(checkbox) {
        checkbox.checked = true;  // Marca todas las casillas como seleccionadas
    });
}

// Función para deseleccionar todas las casillas de verificación
function deseleccionarTodasAficiones() {
    const checkboxes = document.getElementsByName('aficionesSeleccionadas');
    checkboxes.forEach(function(checkbox) {
        checkbox.checked = false;  // Desmarca todas las casillas
    });
}

function seleccionarTodasMusicas() {
    const select = document.getElementById('musicasSeleccionadas');
    for (let i = 0; i < select.options.length; i++) {
        select.options[i].selected = true;  // Marca todas las opciones como seleccionadas
    }
}

// Función para deseleccionar todas las opciones de un <select multiple>
function deseleccionarTodasMusicas() {
    const select = document.getElementById('musicasSeleccionadas');
    for (let i = 0; i < select.options.length; i++) {
        select.options[i].selected = false;  // Desmarca todas las opciones
    }
}

//Función para deseleccionar todos los campos
function deseleccionarTodos(){
    deseleccionarGenero();
    deseleccionarTodasMusicas();
    deseleccionarTodasAficiones();
}

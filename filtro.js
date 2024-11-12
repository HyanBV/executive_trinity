// Global Chnages:
// 1. Modified variables to better indicate their meaning.
// 2. Fixed duality issues.

const productos = [
  {nombre: "Zapato negro", tipo: "zapato", color: "negro", img: "./taco-negro.jpg"},
  {nombre: "Zapato azul", tipo: "zapato", color: "azul", img: "./taco-azul.jpg"},
  {nombre: "Bota negra", tipo: "bota", color: "negro", img: "./bota-negra.jpg"},
  {nombre: "Bota azul", tipo: "bota", color: "azul", img: "./bota-azul.jpg"},
  {nombre: "Zapato rojo", tipo: "zapato", color: "rojo", img: "./zapato-rojo.jpg"}
]

// Fixed Method to properly say "getElementById". Otherwise, it wouldn't work.
const listaProductos = document.getElementById("lista-de-productos");
const input = document.querySelector('input');
const botonDeFiltro = document.querySelector("button");

// Transformed for loop into a forEach loop to better loop through each item inside the object.
const displayProductos = (productos) => {
  listaProductos.innerHTML = '';
  productos.forEach(producto => {
    const productoDiv = document.createElement("div");
    productoDiv.classList.add("producto");

    const titulo = document.createElement("p");
    titulo.classList.add("titulo");
    titulo.textContent = producto.nombre;

    const imagen = document.createElement("img");
    imagen.setAttribute('src', producto.img);
    imagen.alt = producto.nombre;

    productoDiv.appendChild(titulo);
    productoDiv.appendChild(imagen);
    listaProductos.appendChild(productoDiv);
  });
}
displayProductos(productos);

// Added an event listener to the button.
// Also added trim and toLowerCase methods so the function can handle more complex inputs
botonDeFiltro.addEventListener("click", () => {
  const textoFiltro = input.value.trim().toLowerCase();
  const productosFiltrados = filtrarProductos(productos, textoFiltro);
  displayProductos(productosFiltrados);
})

// Modified filter function to have a better filter syntax.
const filtrarProductos = (productos, texto) => {
  return productos.filter(item => {
    return item.tipo.toLowerCase().includes(texto) || item.color.toLowerCase().includes(texto);
  });
};
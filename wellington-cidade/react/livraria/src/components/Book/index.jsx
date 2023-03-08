import './style.css';

function Book({ book }) {
  const { name, description, image } = book;

  return (
    <div id="book">
      <img src={image} alt={`Foto do livro ${name}`} />

      <div id="overlay">
        <h3>{name}</h3>
        <span>{description}</span>

        <button>Comprar</button>
      </div>
    </div>
  );
}

export { Book };
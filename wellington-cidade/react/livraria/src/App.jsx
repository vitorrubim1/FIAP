import './App.css'

import { Book } from './components/Book'
import { Footer } from './components/Footer'

const books = [
  { name: "Um estudo em vermelho", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/WK3jSvEbABqsijnhWQelOcZGla4faKmzDO60l_ND0HQ/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly93d3cu/bHBtLmNvbS5ici9s/aXZyb3MvaW1hZ2Vu/cy91bV9lc3R1ZG9f/ZW1fdmVybWVsaG9f/bm92YV85Nzg4NTI1/NDA4MTEyX2hkLmpw/Zw" },
  { name: "O Signo dos quatro", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/Zfxp8J9cdICj8be7OzVkNcxO_xkTak9sIYVp4vm9l4s/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly93d3cu/bHBtLmNvbS5ici9s/aXZyb3MvaW1hZ2Vu/cy9vX3NpZ25vX2Rv/c19xdWF0cm9fbm92/YV85Nzg4NTI1NDA5/MjMyX2hkLmpwZw" },
  { name: "As aventuras de Sherlock Holmes", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/wGQHeSrLDBCw03eade_jxW6ao8UKvxhJYSYYGhqhPfo/rs:fit:1127:1200:1/g:ce/aHR0cDovLzEuYnAu/YmxvZ3Nwb3QuY29t/Ly05ZlNpTEJQS0Q2/WS9VQ2ZlTTdZaEtN/SS9BQUFBQUFBQUEw/WS9saHNXUmNnS3kx/SS9zMTYwMC9hdmVu/dHVyYXMrc2hlcmxv/Y2suanBn" },
  { name: "As memórias de Sherlock Holmes", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/tdi1KV2MTMKNt1ikKY6jVOrbniWIoNQuV5VFEf4D8XE/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly9pLnBp/bmltZy5jb20vb3Jp/Z2luYWxzL2RmL2E3/LzdlL2RmYTc3ZTNm/NzU0NTIwYmMyNjEw/MDFhZjA2MDJhYWI3/LmpwZw" },
  { name: "O cão de Baskervilles", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/DJukMojJVKQFoIJ3ZFUqrlHXAW2xS9_c11rZjTWviqY/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly93d3cu/bHBtLmNvbS5ici9s/aXZyb3MvaW1hZ2Vu/cy9vX2Nhb19kb3Nf/YmFza2VydmlsbGVf/bm92YV85Nzg4NTI1/NDA4NzMwX2hkLmpw/Zw" },
  { name: "A volta de Sherlock Holmes", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/1WvMN_n9K_Q2m6iicHIIyUvyp_-3mK6QO54Ti1UTfO4/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly9pbWFn/ZXMtbmEuc3NsLWlt/YWdlcy1hbWF6b24u/Y29tL2ltYWdlcy9J/LzgxaURYJTJCQXNU/ZkwuanBn" },
  { name: "O vale do medo", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/CO9sHhOJ-wsF4n9jNIXev5M7rBygKjTaJQWynCyavLs/rs:fit:710:1021:1/g:ce/aHR0cHM6Ly9hLXN0/YXRpYy5tbGNkbi5j/b20uYnIvMTUwMHgx/NTAwL2xpdnJvLXNo/ZXJsb2NrLWhvbG1l/cy1vLXZhbGUtZG8t/bWVkby9ib29rNy85/Nzg4NTk0MzE4MTc2/Lzg2ZTZkN2Y4N2Ez/MzI1Mzk5MTgyYTY1/NzEwYjliZWEwLmpw/Zw" },
  { name: "O último adeus de Sherlock Holmes", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/5sf5t-a2L7T6CKOu3Z5w4WkOHdsYxIBPV1ijZoXPZCw/rs:fit:600:851:1/g:ce/aHR0cHM6Ly9saDMu/Z29vZ2xldXNlcmNv/bnRlbnQuY29tLy02/V2hlOXRUSzZiOC9Y/d1JfUXdyRnVuSS9B/QUFBQUFBQUFlVS9m/NkZUaHhOeTBLa1Iy/cl80MHZUc3FxY0lf/TmVUNHZqNUFDTGNC/R0FzWUhRL3MxNjAw/LzE1OTQxMzAyMTY3/OTk5NTQtMC5wbmc" },
  { name: "Histórias de Sherlock Holmes", description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", image: "https://imgs.search.brave.com/q2bsMirFNFdF0Y4I1LyfFK7C-H0kS0ZWXL1q9KOorkg/rs:fit:642:930:1/g:ce/aHR0cHM6Ly9saXZy/YXJpYWRhdmlsYS52/dGV4aW1nLmNvbS5i/ci9hcnF1aXZvcy9p/ZHMvNjI1NTU5LTY0/Mi05MzAvOTc4ODUz/NzgxNTYyNS5qcGc_/dj02Mzc1MDIxMTA5/OTY5MDAwMDA" },
]

function App() {
  return (
    <>
      <h1>Sherlock library</h1>

      <div id="books-container">
        {books.map((book) => <Book book={book} />)}
      </div>

      <Footer />
    </>
  )
}

export default App

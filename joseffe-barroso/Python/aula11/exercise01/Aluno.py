class Aluno:
    def __init__(self, ra=None, nome=None, curso=None, id=0, endereco=None):
      self.__ra = ra
      self.__nome = nome
      self.__curso = curso
      self.__id = id
      self.__endereco = endereco

    @property
    def ra(self):
      return self.__ra
   
    @ra.setter
    def ra(self, ra):
      self.__ra = ra
    
    @property
    def nome(self):
      return self.__nome
   
    @nome.setter
    def nome(self, nome):
      self.__nome = nome

    @property
    def curso(self):
      return self.__curso
   
    @curso.setter
    def curso(self, curso):
      self.__curso = curso

    @property
    def id(self):
      return self.__id
   
    @id.setter
    def id(self, id):
      self.__id = id
    
    @property
    def endereco(self):
      return self.__endereco
   
    @endereco.setter
    def endereco(self, endereco):
      self.__endereco = endereco

    def exibeEndereco(self):
      return f"Endereço: {self.__endereco}"

    def exibeAluno(self):
      return f"ID: {self.__id} = Nome: {self.__nome} | RA: {self.__ra} | Curso: {self.__curso} | Endereço: {self.exibeEndereco()}"
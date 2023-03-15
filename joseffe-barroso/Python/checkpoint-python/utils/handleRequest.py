import requests

def handleRequest(url):
  response = requests.get(url)

  data = ""

  if response.status_code == 200: 
    data = response.json()

  return data
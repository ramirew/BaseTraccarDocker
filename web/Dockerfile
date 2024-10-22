# Utiliza la imagen base de Node.js
FROM node:18

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos package.json y package-lock.json (si existe)
COPY package*.json ./

# Instala las dependencias
RUN npm install --legacy-peer-deps

# Copia todo el contenido del proyecto a la carpeta de trabajo en el contenedor
COPY . .

# Compila la aplicación para producción
RUN npm run build

# Exposición del puerto utilizado por Vite
EXPOSE 3000

# Comando para ejecutar la aplicación en modo producción
CMD ["npm", "start", "--", "--host=0.0.0.0"]

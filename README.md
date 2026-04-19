# pesquisajuridica

Este repositório agora inclui um ambiente básico de desenvolvimento mobile usando Expo e React Native.

## Como usar

1. Instale o Node.js 18+ e o npm.
2. (Opcional) instale o Expo CLI globalmente:
   ```bash
   npm install -g expo-cli
   ```
3. No diretório do projeto, instale as dependências:
   ```bash
   npm install
   ```
4. Inicie o servidor de desenvolvimento:
   ```bash
   npm start
   ```
5. Execute no emulador ou dispositivo:
   - `npm run android`
   - `npm run ios`
   - `npm run web`

## Estrutura criada

- `package.json` - dependências e scripts de execução
- `app.json` - configuração do Expo
- `babel.config.js` - configuração do Babel para Expo
- `App.js` - ponto de entrada da aplicação React Native
- `.gitignore` - arquivos e pastas ignorados pelo Git

## Observações

- O ambiente usa Expo para facilitar o desenvolvimento mobile em Android, iOS e Web.
- Caso prefira, instale o aplicativo Expo Go no celular para testar diretamente pelo QR code.

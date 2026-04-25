import { Redirect } from 'expo-router';

export default function Index() {
  const isLogged = false; // depois você troca isso

  if (!isLogged) {
    return <Redirect href="/login" />;
  }

  return <Redirect href="/(tabs)" />;
}
import { Platform, StyleSheet, TouchableOpacity, TextInput } from 'react-native';
import { useState } from 'react';
import ParallaxScrollView from '@/components/parallax-scroll-view';
import { ThemedText } from '@/components/themed-text';
import { ThemedView } from '@/components/themed-view';
import { Text } from 'react-native';
import { Fonts } from '@/constants/theme';

// Componente principal para dar a vida ao Home inicial
export default function HomeScreen() {
  const [search, setSearch] = useState('');

  return (
    <ParallaxScrollView
      headerBackgroundColor={{ light: '', dark: '' }}
      headerImage={<></>}
    >
      {/* Titulo principal */}
      <ThemedView style={stylesPageIndex.titleContainer}>
        <ThemedText type="title">Procura Jurídica</ThemedText>
      </ThemedView>

      <ThemedView style={stylesPageIndex.containerPrincipal}>
        {/* Campo de busca */}
        <ThemedView style={stylesPageIndex.searchRow}>
          <TextInput
            placeholder="Pesquisar..."
            value={search}
            onChangeText={setSearch}
            style={stylesPageIndex.input}
          />

          {/* Button para buscar */}
          <TouchableOpacity
            style={stylesPageIndex.buttonCounter}>
            <Text style={stylesPageIndex.button}>Buscar</Text>
          </TouchableOpacity>

        </ThemedView>
      </ThemedView>
    </ParallaxScrollView>

  );
}

const stylesPageIndex = StyleSheet.create({

  containerPrincipal: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 0,
  },

  titleContainer: {
    alignItems: 'flex-start',
    gap: 8,
  },

  button: {
    backgroundColor: '#1E1E1E',
    color: '#f8f8f8',
    paddingVertical: 10,
    paddingHorizontal: 20,
    borderRadius: 6,
  },

  buttonCounter: {
    paddingVertical: 4,
    paddingHorizontal: 6,
    marginLeft: -10,
    marginRight: 0,
  },

  input: {
    flex: 1,
    backgroundColor: '#f8f8f8',
    padding: 14,
    borderRadius: 6,
  },

  searchRow: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 10,
    width: '115%',
    paddingHorizontal: 20,
  }
});     
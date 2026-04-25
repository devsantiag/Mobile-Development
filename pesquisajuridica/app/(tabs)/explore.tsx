import { StyleSheet } from 'react-native';
import ParallaxScrollView from '@/components/parallax-scroll-view';
import { ThemedText } from '@/components/themed-text';
import { ThemedView } from '@/components/themed-view';

export default function TabTwoScreen() {
  return (
    <ParallaxScrollView
      headerBackgroundColor={{ light: '', dark: '' }}
      headerImage={<></>}>
      <ThemedView style={styles.titleContainer}>
        <ThemedText type="title">Histórico de pesquisa</ThemedText>
      </ThemedView>

      <ThemedText>
        Lorem ipsum, dolor sit amet consectetur adipisicing elit. Nostrum optio amet cumque iste ipsam unde accusantium quia, distinctio, ipsa veniam officiis. Ipsum unde odio quo! Quae unde molestias totam eius?
      </ThemedText>

    </ParallaxScrollView>
  );
}

const styles = StyleSheet.create({
  titleContainer: {
    flexDirection: 'row',
    gap: 8,
  },
});

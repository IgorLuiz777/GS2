
import { Card } from '@/components/card'
import './home.scss'
import Link from 'next/link'

export default function Home() {
  return (
    <main>
      <div className='content_home'>
        <div className='home01'>
          <div className='texto'>
            <h1>Bem-vindo ao <span>TechCare 4 All</span> - Sua Comunidade de Saúde Conectada!</h1>
            <p>Descubra uma nova forma de cuidar da sua saúde e daqueles que você ama. TechCare 4 All é mais do que uma simples rede social; é a sua plataforma dedicada ao rastreamento de saúde entre amigos, trazendo mais consciência, apoio e informação para o seu círculo mais próximo.</p>
          </div>
          <img src="home2_img.png" alt="home img" width={500}/>
        </div>
        <div className='metas'>
          <h2>Metas:</h2>
          <div className='cards'>
            <Card title="Rastreamento e Alertas de Exposição" text="Desenvolvemos um sistema robusto de rastreamento de contatos para identificar rapidamente e notificar usuários que estiveram próximos a pessoas diagnosticadas com doenças transmissíveis." />
            <Card title="Educação em Saúde e Conscientização" text="Criamos recursos educativos sobre as doenças alvo, informações detalhadas sobre sintomas, métodos de transmissão e práticas de prevenção, além de incentivo a vacinação e medidas de higiene." />
            <Card title="Monitoramento de Surtos e Tendências" text="Estamos implementando ferramentas de análise de dados para identificar padrões de surtos e tendências das doenças, permitindo uma resposta rápida e eficiente às emergências de saúde." />
          </div>
        </div>
        <h3 className='h3_home'>Se deseja cuidar de você e daqueles que ama. Junte-se a nós clicando <Link href={'/cadastro'}>aqui</Link> para seguir no caminho de uma vida mais saudável e protegida.</h3>
        <img src='phone.png'/>
      </div>
    </main>
  )
}


import Header from '@/components/header'
import './globals.css'

export const metadata = {
  title: 'TechCare 4 All',
  description: 'Global Solution TechCare 4 All - VR',
}

export default function RootLayout({ children }) {
  return (
    <html lang="pt-br">
      <body>
        <Header></Header>
        {children}
      </body>
    </html>
  )
}

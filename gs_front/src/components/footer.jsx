
import { CiFacebook } from "react-icons/ci";
import { FaInstagram } from "react-icons/fa";
import { RiTelegramLine } from "react-icons/ri";
import { TiSocialTwitter } from "react-icons/ti";
import './components.scss'

export default function Footer() {

    return (
        <div className='content_footer'>
            <footer>
                <p>TechCare <span>4 All</span></p>

                <div className="icons">
                    <CiFacebook size={40} className="icons1" />
                    <FaInstagram size={40} className="icons1" />
                    <RiTelegramLine size={40} className="icons1" />
                    <TiSocialTwitter size={40} className="icons1" />
                </div>
            </footer>
            <div className="grupo">
                <p>IGOR LUIZ PEREIRA DE LIMA - RM 99809 | LUCAS LIMA RYCHLICKI - RM 551253 | GUSTAVO MONTE SANTO OLIVEIRA GONÇALVES - RM 551601 | PEDRO HENRIQUE FERREIRA CASTANHO - RM 551598  | MURILO CAUMO MURGIA - RM 551247</p>
            </div>
        </div>
    )
}

// import JavaBasics from '.components/view_components/JavaBasics';
// import InternalMemory from './components/view_components/InternalMemory';
// import Steps from './components/view_components/StepsInfo'
// import FurtherSteps from './components/view_components/FurtherSteps';
// import DataStrucures from './components/view_components/DsCore'
// import { CoreComponents } from './components/view_components/DsCore';  
/**The Above dependencies are as per the App.js, Below is the modified version */

import {PersonInfo} from "../JsComponent/PersonInfo.jsx";
import DataStrucures, { CoreComponents } from "./DsCore";
import FurtherSteps from "./FurtherSteps";
import InternalMemory from "./InternalMemory";
import JavaBasics from "./JavaBasics";
import Steps from "./StepsInfo";

  
  export default function LearningComponent() {
        return (
            <>
            <Steps/>
            <JavaBasics/>
            <InternalMemory/>
            <FurtherSteps/>
            <DataStrucures/>
            <CoreComponents/>
            <hr />
            <hr />
            <PersonInfo />
            </>
        )
  }